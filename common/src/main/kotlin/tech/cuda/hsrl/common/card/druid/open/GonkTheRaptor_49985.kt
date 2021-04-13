package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GonkTheRaptor_49985 : Card() {
    override val id = 49985
    override val name = "贡克，迅猛龙之神"
    override val description = "在你的英雄攻击并消灭一个随从后，便可再次攻击。"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "拒绝向贡克效忠的赞达拉德鲁伊有一个共性：特别好吃。"
    override val artist = "Christopher Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80d14529dec0a5e3b4774b1ab6fbe068628d1df2eb187226fde4821c0e6ed032.png"
}
