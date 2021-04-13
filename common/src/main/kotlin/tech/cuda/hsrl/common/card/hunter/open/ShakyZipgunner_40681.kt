package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShakyZipgunner_40681 : Card() {
    override val id = 40681
    override val name = "豺狼人土枪手"
    override val description = "<b>亡语：</b>随机使你手牌中的一张随从牌获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "污手党提供的装备稳定性不怎么好，误伤事件屡有发生。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7aaa57c34412e9667cc151158a5c92fc8e22d16af2b0e78ed7244b7ccd2bf4c7.png"
}
