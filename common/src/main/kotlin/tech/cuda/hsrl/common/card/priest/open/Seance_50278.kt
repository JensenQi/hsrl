package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Seance_50278 : Card() {
    override val id = 50278
    override val name = "灵媒术"
    override val description = "选择一个随从，将一张它的复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“万灵说你两回合前错斩了。''什么？来来来……大家就当无事发生过。”"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a21fa4b0666d7ba48f8c3c0c8c08952796d1bd4cdf4b951f245144fa390e049a.png"
}
