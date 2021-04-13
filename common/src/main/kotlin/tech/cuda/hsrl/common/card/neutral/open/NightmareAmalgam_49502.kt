package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightmareAmalgam_49502 : Card() {
    override val id = 49502
    override val name = "梦魇融合怪"
    override val description = "<i>这张牌是元素，机械，恶魔，鱼人，龙，野兽，海盗和图腾。</i>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.All
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "爱谁谁。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c37fcbc0f3b09abafc0e0c872b09e7481446c553f969c1d00fdc08b1bf2e7bbe.png"
}
