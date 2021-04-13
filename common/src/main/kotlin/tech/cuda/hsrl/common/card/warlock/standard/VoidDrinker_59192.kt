package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidDrinker_59192 : Card() {
    override val id = 59192
    override val name = "虚空吸食者"
    override val description = "<b>嘲讽，战吼：</b>摧毁一张你牌库中的灵魂残片，获得+3/+3。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "虚空和吸食者的共同点：尝不出味道。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba0645315d22e2d3b568cc7a27421e4c3e9a956e3d9b34444c3db678f04e09c1.png"
}
