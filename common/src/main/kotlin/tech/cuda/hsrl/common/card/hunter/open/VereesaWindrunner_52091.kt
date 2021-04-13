package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VereesaWindrunner_52091 : Card() {
    override val id = 52091
    override val name = "温蕾萨·风行者"
    override val description = "<b>战吼：</b>装备索利达尔，群星之怒。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "三个姐妹，三支利箭。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b52b91f582834a53a8ce7a0b6d6c07ad7eaf27c6893b749beeacdb71d729a9f3.png"
}
