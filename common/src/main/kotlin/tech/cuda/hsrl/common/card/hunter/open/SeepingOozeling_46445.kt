package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SeepingOozeling_46445 : Card() {
    override val id = 46445
    override val name = "渗水的软泥怪"
    override val description = "<b>战吼：</b> 随机获得牌库中一个随从的<b>亡语</b>。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "呃，你最好找人来修一下。"
    override val artist = "Anton Kagounkin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/65cda67615b393ce24c9c5481b97e193b01b54e6b5adeeba53c074db07f13fac.png"
}
