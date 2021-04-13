package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ObsidianStatue_42598 : Card() {
    override val id = 42598
    override val name = "黑曜石雕像"
    override val description = "<b>嘲讽</b>，<b>吸血</b> <b>亡语：</b>随机消灭一个敌方随从。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Kotf
    override val background = "原画师花了大量工夫，用凿子在面部精雕细琢，才表现出这副嘲讽的表情。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c41c18fa155eae135e41eeb74bcd77ce3efabc277aa4f294d1e5c83d51b568f.png"
}
