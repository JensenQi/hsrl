package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidTerror_69915 : Card() {
    override val id = 69915
    override val name = "虚空恐魔"
    override val description = "<b>战吼：</b>消灭该随从两侧的随从，并获得他们的攻击力和生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你把这张牌放到你的套牌中，你就会失去其他随从对你的信任。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cfba748aa024c0b03d296b8f0f10084e6758b3b316aac7062ce8801617050347.png"
}
