package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BarrensTrapper_63381 : Card() {
    override val id = 63381
    override val name = "贫瘠之地诱捕者"
    override val description = "你的<b>亡语</b>牌的法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "在诱饵里加一点点鱼人肉，野兽顶不住的……"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bdd60ba43408f21ce5e76bb9af848962f99f51423f50c467de4db2dd1b8d69e9.png"
}
