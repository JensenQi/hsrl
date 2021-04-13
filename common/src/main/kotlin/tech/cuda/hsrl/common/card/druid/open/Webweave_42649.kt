package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Webweave_42649 : Card() {
    override val id = 42649
    override val name = "蛛网"
    override val description = "召唤两只1/2并具有<b>剧毒</b>的 蜘蛛。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "遍身丝网者，不是养蛛人。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/982cfcc9eba0cd7020b3522daa889148249b80913e0e5af5bf9c0bf821eb2f85.png"
}
