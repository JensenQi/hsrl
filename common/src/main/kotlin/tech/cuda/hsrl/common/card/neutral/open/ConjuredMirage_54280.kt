package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConjuredMirage_54280 : Card() {
    override val id = 54280
    override val name = "魔法幻象"
    override val description = "<b>嘲讽</b> 在你的回合开始时，将该随从洗入你的 牌库。"
    override var cost: Int? = 4
    override var health: Int? = 10
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "你所见即是伊希斯特。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/77685df095274862ad3ebdd09f5db4a15fee239eb562b3241959c00fed743652.png"
}
