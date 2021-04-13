package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GiantWasp_41328 : Card() {
    override val id = 41328
    override val name = "巨型黄蜂"
    override val description = "<b>潜行</b> <b>剧毒</b>"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "像蝴蝶一样飞舞，像黄蜂一样出击！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be24cb64799f8c050da6b105f9b654b93220aedf9a4eb5e24ddc731466908acf.png"
}
