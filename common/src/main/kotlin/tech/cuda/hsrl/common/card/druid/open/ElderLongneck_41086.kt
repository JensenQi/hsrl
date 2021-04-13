package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElderLongneck_41086 : Card() {
    override val id = 41086
    override val name = "年迈的长颈龙"
    override val description = "<b>战吼：</b> 如果你的手牌中有攻击力大于或等于5的随从牌，便获得<b>进化</b>。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "一旦上了岁数，颈椎的问题就特别突出。"
    override val artist = "Trent Kaniuga"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34eb106323201393500dd3480473217ca23b75074f2bed1bf20c59cd786f2c8d.png"
}
