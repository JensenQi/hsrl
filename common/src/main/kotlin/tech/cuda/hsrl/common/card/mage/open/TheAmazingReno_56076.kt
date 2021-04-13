package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheAmazingReno_56076 : Card() {
    override val id = 56076
    override val name = "神奇的雷诺"
    override val description = "<b>战吼：</b>使所有随从消失。<i>*咻！*</i>"
    override var cost: Int? = 10
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "“雷诺！”“请用正确的方式称呼我。”“<叹气><i>神奇的</i>雷诺……”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c69ef847059f610eeaf9c5fcb38363263d8104eb6ec74921e6e54b222b16137d.png"
}
