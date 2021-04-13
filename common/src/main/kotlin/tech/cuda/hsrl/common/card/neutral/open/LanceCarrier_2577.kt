package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LanceCarrier_2577 : Card() {
    override val id = 2577
    override val name = "持枪侍从"
    override val description = "<b>战吼：</b>使一个友方随从获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "持枪侍从在兽人军队的编制里属于入门级。不过有趣的是，没几个兽人会用枪。"
    override val artist = "Tyson Murphy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6aa59ad000e14456ef03c8264592e1bd5d3bd0e658b17d2530016e9d2570ca0e.png"
}
