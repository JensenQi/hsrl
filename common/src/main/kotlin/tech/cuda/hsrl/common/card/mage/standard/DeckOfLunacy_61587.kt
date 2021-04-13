package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeckOfLunacy_61587 : Card() {
    override val id = 61587
    override val name = "愚人套牌"
    override val description = "将你牌库中的法术牌变形成为法力值消耗增加（3）点的法术牌。<i>（保留原来的法力值消耗。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "在暗月马戏团按月发行的《暗月月刊》中被评为“最愚的套牌”。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1bda340dd8d8a8ade35f4559cb8f1624968c37db12f4f690414e22624b71d291.png"
}
