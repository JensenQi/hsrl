package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ToxicReinforcements_55301 : Card() {
    override val id = 55301
    override val name = "病毒增援"
    override val description = "<b>支线任务：</b> 使用你的英雄技能三次。<b>奖励：</b>召唤三个2/1的麻风侏儒。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "一旦发生舱内失压，我们会部署一部弹弓来进行疏散。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3bdb039a0a94f9594685ccce6d56ef1f36380e18e2e022e2f55adaf1d6a0386.png"
}
