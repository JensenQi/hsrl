package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CybertechChip_48772 : Card() {
    override val id = 48772
    override val name = "机核芯片"
    override val description = "使你的所有随从获得 “<b>亡语：</b>随机将一张机械牌置入你的手牌”。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "不好的一点就是——去哪都会被人知道。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93879676639d2edf02749eb4d7543f5f210f559b0d12c505d227046eee2caac4.png"
}
