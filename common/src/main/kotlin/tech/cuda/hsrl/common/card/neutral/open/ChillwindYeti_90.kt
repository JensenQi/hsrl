package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChillwindYeti_90 : Card() {
    override val id = 90
    override val name = "冰风雪人"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "他梦想着有一天能够下山开一间拉面店。但他没有那个勇气。"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/55d4afdf4a91f7a628eb0f80d2c5048371f9b410266d5a7bbded94a8657b8a7a.png"
}
