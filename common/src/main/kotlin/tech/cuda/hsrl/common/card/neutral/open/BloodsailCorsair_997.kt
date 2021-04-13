package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodsailCorsair_997 : Card() {
    override val id = 997
    override val name = "血帆海盗"
    override val description = "<b>战吼：</b>使对手的武器失去1点耐久度。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "每个海盗都用相同的四个数字来打开自动黄金分配装置。这些数字被称为“海盗密码”。"
    override val artist = "Randy Gallegos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb035c5862fb8a56151ada63cfc5234ad1f745d4769252eb1618a8aa70fdc3f7.png"
}
