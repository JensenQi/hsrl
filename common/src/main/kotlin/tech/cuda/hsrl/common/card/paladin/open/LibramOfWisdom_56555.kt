package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LibramOfWisdom_56555 : Card() {
    override val id = 56555
    override val name = "智慧圣契"
    override val description = "使一个随从获得+1/+1，以及“<b>亡语：</b>将一张‘智慧圣契’法术牌置入你的手牌。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "最好的智慧便是传承。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85260b2b80f90cecb2cbd481a31c7b41370b17305baf323be418c0e8153c8633.png"
}
