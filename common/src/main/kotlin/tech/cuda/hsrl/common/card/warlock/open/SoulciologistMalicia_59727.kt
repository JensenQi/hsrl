package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulciologistMalicia_59727 : Card() {
    override val id = 59727
    override val name = "灵魂学家玛丽希亚"
    override val description = "<b>战吼：</b>你的牌库中每有一张灵魂残片，召唤一个3/3并具有<b>突袭</b>的灵魂。 <i>（召唤 个）</i>"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "珍爱生命，别说她的研究领域是“软科学”。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a77091b74a21776048d45d588e0533b2f70322039d252ec982358ae378785fe.png"
}
