package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MortuaryMachine_54284 : Card() {
    override val id = 54284
    override val name = "机械法医"
    override val description = "在你的对手使用一张随从牌后，使其获得<b>复生</b>。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "踝骨后面是胫骨，指骨后面是……呃，就这么着吧。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc672b7f5508f837d3282c26535ddf98380ff01e699d1a74654e7734f70625a7.png"
}
