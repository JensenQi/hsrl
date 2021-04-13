package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarnivalBarker_61188 : Card() {
    override val id = 61188
    override val name = "狂欢报幕员"
    override val description = "每当你召唤一个生命值为1的随从，便使其获得+1/+2。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "游客表示听不懂他的鬼哭狼嚎，所以他只好改说人话。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e28710c23aaa6a9cf8675e6ddb950571a4d98dfa4e95f8bad6e60b3535d7dd3.png"
}
