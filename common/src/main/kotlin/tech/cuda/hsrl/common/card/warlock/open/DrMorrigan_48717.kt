package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrMorrigan_48717 : Card() {
    override val id = 48717
    override val name = "莫瑞甘博士"
    override val description = "<b>亡语：</b> 将该随从与你牌库中的一个随从互换。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "不拿到终生聘任她决不罢休。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34e03818c71cfbd3c64361ae4656a14f927e40970acbc01c44e5c92b98f32ef5.png"
}
