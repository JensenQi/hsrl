package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmeraldHiveQueen_41261 : Card() {
    override val id = 41261
    override val name = "翡翠蜂后"
    override val description = "你的随从的法力值消耗增加（2）点。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "伊瑟拉对于蜂后将自己的蜂巢命名为“翡翠梦境”感到怒不可遏，发誓要告到她倾家荡产。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b43e1c0ef180c96840bc941a24e8c99dafaaea9d7785c3b50ec85102ab5c5854.png"
}
