package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sabotage_2015 : Card() {
    override val id = 2015
    override val name = "暗中破坏"
    override val description = "随机消灭一个敌方随从，<b>连击：</b>并且摧毁你对手的武器。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "潜行者们是暗中破坏的高手，他们会让你没有帮手，接着一无所有。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3479bbcc279721471afcc550bbc802642d8b96c3e1fb3d1dee34252b079df6d.png"
}
