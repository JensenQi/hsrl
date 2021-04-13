package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToMySide_45546 : Card() {
    override val id = 45546
    override val name = "来我身边"
    override val description = "召唤一个动物伙伴，如果你的牌库里没有随从牌，则召唤两个。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "我独自狩猎。还有米莎。还有霍弗。还有雷欧克。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9923f03645e1dcd908f783b1c572d43600d54f9c7eada23f94191e38a95dd6a9.png"
}
