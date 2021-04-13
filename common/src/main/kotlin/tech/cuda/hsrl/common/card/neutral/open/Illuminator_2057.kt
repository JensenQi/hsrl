package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Illuminator_2057 : Card() {
    override val id = 2057
    override val name = "明光祭司"
    override val description = "如果在你的回合结束时，你控制一个<b>奥秘</b>，则为你的英雄恢复 4点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "“明光闪烁！”他们可不会念这样的咒语；你以为这是哪儿？霍格沃茨魔法学校？"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/198704d776e6c1c4bd8aa365a607b02211a1353b29c5b11ea9c7eab4ca3e9b4e.png"
}
