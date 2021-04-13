package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheMarshQueen_41368 : Card() {
    override val id = 41368
    override val name = "湿地女王"
    override val description = "<b>任务：</b>使用七张法力值消耗为（1）的随从牌。 <b>奖励：</b>卡纳莎女王。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "是1个大恐龙可怕呢，还是15个小恐龙可怕呢？这是一个值得思考的…啊！它们来了！！"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/554807b5cd193df27b672d2f2d1b82664a5bf157721a06c411a642d0d1f1b3c2.png"
}
