package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HenchClanShadequill_51715 : Card() {
    override val id = 51715
    override val name = "荆棘帮箭猪"
    override val description = "<b>亡语：</b>为敌方英雄恢复5点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "不怕神一样的对手……"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/971cfa195264f684c645cad6ca47c12ab5a45021431af67b211b34a1f6147f00.png"
}
