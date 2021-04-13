package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Howlfiend_42642 : Card() {
    override val id = 42642
    override val name = "咆哮魔"
    override val description = "每当该随从受到伤害，随机弃掉 一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "问题就在于他把卡牌衔在嘴里了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f39aef714800900bcf0d2cd86eb911264964d0ee973aea2dc13382565b23d800.png"
}
