package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonmawScorcher_50412 : Card() {
    override val id = 50412
    override val name = "龙喉喷火者"
    override val description = "<b>战吼：</b>对所有其他随从造成1点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "注意：易燃易爆炸"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/50e84227efefa0d7d40ca3f624e13a81bca27a96bfbeaf01fb12d0209a86f3bc.png"
}
