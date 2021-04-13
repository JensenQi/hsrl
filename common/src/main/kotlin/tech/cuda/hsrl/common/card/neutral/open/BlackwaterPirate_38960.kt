package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlackwaterPirate_38960 : Card() {
    override val id = 38960
    override val name = "黑水海盗"
    override val description = "你的武器法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "传闻地精财阀暗地里提供了资金支持，从而使黑水海盗得以迅速发展壮大。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/98c413e6aff1878eb036419167b2405897e747e4dd5a7de160aee9150e0fdf90.png"
}
