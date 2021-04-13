package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LyraTheSunshard_42046 : Card() {
    override val id = 42046
    override val name = "“太阳裂片”莱拉"
    override val description = "每当你施放一个法术，随机将一张牧师法术牌置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "起来吧，美丽的太阳！赶走那妒忌的敌人，他们因为你的传说卡牌美得多，已经气得面色惨白了。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec277423c9a2f2dc1b5ce1471b4052fd3e6335ac00cfa1517c9e11890ba8b858.png"
}
