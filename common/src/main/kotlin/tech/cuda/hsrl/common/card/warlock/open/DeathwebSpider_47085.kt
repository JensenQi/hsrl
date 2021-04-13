package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathwebSpider_47085 : Card() {
    override val id = 47085
    override val name = "逝网蜘蛛"
    override val description = "<b>战吼：</b>如果你的英雄在本回合受到过伤害，获得<b>吸血</b>。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.TheWitchwood
    override val background = "“谁敢伤害我的主人，我就吸他的血！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b62b181f3c1cde7436dab064f949ac5abed14536e6404b34ebaba5738acd950.png"
}
