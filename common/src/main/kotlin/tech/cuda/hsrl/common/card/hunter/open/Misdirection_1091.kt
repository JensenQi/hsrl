package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Misdirection_1091 : Card() {
    override val id = 1091
    override val name = "误导"
    override val description = "<b>奥秘：</b>当一个敌人攻击你的英雄时，改为该敌人随机攻击另一个角色。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "再狡猾的狐狸……也会被猎人误导。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c32e80d66f0c0c809e4ad4d15679f41c9fe185388c6ccb7e64bdc80397ed0e1e.png"
}
