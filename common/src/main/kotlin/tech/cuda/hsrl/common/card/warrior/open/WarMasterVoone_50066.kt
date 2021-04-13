package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarMasterVoone_50066 : Card() {
    override val id = 50066
    override val name = "指挥官沃恩"
    override val description = "<b>战吼：</b>复制你手牌中的所有龙牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "指挥官这头衔听起来比幼龙保姆酷多了。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e9c261447e029279b71ca98abdfc1a0ceaf7b966deae5ebe4436711aa58b23c9.png"
}
