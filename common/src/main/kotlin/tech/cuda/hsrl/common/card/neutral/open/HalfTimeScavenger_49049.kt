package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HalfTimeScavenger_49049 : Card() {
    override val id = 49049
    override val name = "中场拾荒者"
    override val description = "<b>潜行</b> <b>超杀</b>：获得3点 护甲值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "彼之砒霜，我之神装。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a79e0f4710bd4c6f73ec0cdc4a3828a5dd9e152b9452d30e7440b79c1571717.png"
}
