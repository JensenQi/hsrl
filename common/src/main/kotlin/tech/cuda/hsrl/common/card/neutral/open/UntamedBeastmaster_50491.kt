package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UntamedBeastmaster_50491 : Card() {
    override val id = 50491
    override val name = "狂野兽王"
    override val description = "每当你抽到一张野兽牌时，使其获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "只消挠挠肚子即可。"
    override val artist = "E. Kenji & M. Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58933edbbd05697032cf788112a91ed4f56f508e2f83b30ca3ed26622821c11f.png"
}
