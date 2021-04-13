package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZombieChow_1753 : Card() {
    override val id = 1753
    override val name = "肉用僵尸"
    override val description = "<b>亡语：</b>为敌方英雄恢复 5点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "僵尸。好吃的僵尸。"
    override val artist = "E. M. Gist"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/51d71ccf41f36ec28cb73310bc0bdd9b241fbcad9467fb94d79149f5d7354cb9.png"
}
