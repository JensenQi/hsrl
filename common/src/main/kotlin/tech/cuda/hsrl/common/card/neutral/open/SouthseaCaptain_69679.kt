package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SouthseaCaptain_69679 : Card() {
    override val id = 69679
    override val name = "南海船长"
    override val description = "你的其他海盗获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "当他掠夺到足够的财宝之后，他一定要去订做一顶帅气的船长帽子。他是帽子控。"
    override val artist = "Ken Steacy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc3e895b3a3dda9ff154c1f564fbb06fc25a58eee17fa3c68263ccba68252dbb.png"
}
