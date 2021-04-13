package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RighteousCause_54924 : Card() {
    override val id = 54924
    override val name = "正义感召"
    override val description = "<b>支线任务：</b> 召唤五个随从。<b>奖励：</b>使你的所有随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“我特此封你为探险者协会学员！下一位！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a1120222adef1ac614a7196e2fdf3b64c76c7d06015cbc2831a1ac4ab2a89b6.png"
}
