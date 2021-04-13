package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TuralyonTheTenured_59569 : Card() {
    override val id = 59569
    override val name = "终身教授图拉扬"
    override val description = "<b>突袭</b> 每当其攻击一个随从，将目标的攻击力和生命值变为3。"
    override var cost: Int? = 8
    override var health: Int? = 12
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“愿邪恶在正义面前退散；愿弱者在和平之中安居。我愿终有一天，所有人都无需恐惧。而为了那一天，我愿献出我的生命。”"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a673bebf04190c77124cf25ca7573fa3b7995f8a717dea8f682e15516ed71d2.png"
}
