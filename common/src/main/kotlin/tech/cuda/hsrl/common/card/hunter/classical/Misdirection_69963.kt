package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Misdirection_69963 : Card() {
    override val id = 69963
    override val name = "误导"
    override val description = "<b>奥秘：</b>当一个敌人攻击你的英雄时，改为该敌人随机攻击另一个角色。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "再狡猾的狐狸……也会被猎人误导。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/14ab0ce8a5f7a4afbb340633f45eb74c61d9bad9a92d2dfad6676b5fbd0b90d5.png"
}
