package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoidTerror_1221 : Card() {
    override val id = 1221
    override val name = "虚空恐魔"
    override val description = "<b>战吼：</b>消灭该随从两侧的随从，并获得他们的攻击力和生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "如果你把这张牌放到你的套牌中，你就会失去其他随从对你的信任。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48276ba9e3279e615439c7d9190e0f55e9c0babc77baed59fcd763d845809b25.png"
}
