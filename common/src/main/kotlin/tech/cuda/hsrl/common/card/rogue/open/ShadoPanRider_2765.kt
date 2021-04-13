package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadoPanRider_2765 : Card() {
    override val id = 2765
    override val name = "影踪骁骑兵"
    override val description = "<b>连击：</b> 获得+3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "在经历完锦绣谷一役后，他决定好好度个假。通常他的避暑方式就是爬到雪山顶上去干掉几个雪人。"
    override val artist = "Ryan Metcalf"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b1145e3d9e6d545395290431053f863c7dac0de92598e3144bad799772d86834.png"
}
