package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaCaptain_70091 : Card() {
    override val id = 70091
    override val name = "南海船长"
    override val description = "你的其他海盗获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "当他掠夺到足够的财宝之后，他一定要去订做一顶帅气的船长帽子。他是帽子控。"
    override val artist = "Ken Steacy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b26a8e4e43e562ca1211bf09bee10c1cefd1ec2823986e822f15e7e4ae27c00d.png"
}
