package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SandDrudge_50315 : Card() {
    override val id = 50315
    override val name = "沙地苦工"
    override val description = "每当你施放一个法术，召唤一个1/1并具有<b>嘲讽</b>的僵尸。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "爱好：沙滩散步，召唤僵尸，吃巧克力。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b6962f482a8bf177031a097821afd7ea662a9b033a89fed9403d7ad6a0660f1.png"
}
