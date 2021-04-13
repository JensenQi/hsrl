package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stegodon_41324 : Card() {
    override val id = 41324
    override val name = "剑龙"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "升到40级的圣骑士被要求去驯服一头剑龙，所以这世界上并不存在41级的圣骑士。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1756f8e9949a2ac565fe5f8def92c6f18705121760aa260b81e083efcb98fb66.png"
}
