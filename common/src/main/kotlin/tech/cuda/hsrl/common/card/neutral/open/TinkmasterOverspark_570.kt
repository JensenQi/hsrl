package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TinkmasterOverspark_570 : Card() {
    override val id = 570
    override val name = "工匠大师欧沃斯巴克"
    override val description = "<b>战吼：</b> 随机使另一个随从变形成为一个5/5的魔暴龙或一个1/1的松鼠。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "在09年度的铁炉堡松鼠大暴走事件之后，工匠大师欧沃斯巴克差点丢掉了他的工匠执照。"
    override val artist = "Tom Baxa"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/54ab98bdeedba09cded582944fdb26685de88d2f367feef926bd5743fd626ba2.png"
}
