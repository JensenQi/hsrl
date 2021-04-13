package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bite_69982 : Card() {
    override val id = 69982
    override val name = "撕咬"
    override val description = "使你的英雄获得4点护甲值，并在本回合中获得 +4攻击力。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "一般说来，你不把嘴里的肉嚼完，是不舍得变回人形态的。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/89b066cfcd747c5be8c1a8c34ec69b512fabe51bd4bc50ac0dab0a7453deafee.png"
}
