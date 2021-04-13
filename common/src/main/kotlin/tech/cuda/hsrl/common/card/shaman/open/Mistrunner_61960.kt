package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mistrunner_61960 : Card() {
    override val id = 61960
    override val name = "迷雾行者"
    override val description = "<b>战吼：</b>使一个友方随从获得+3/+3。 <b>过载：</b>（1）"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“快把它弄下来！！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c19628c42382a1b008a33ceb684e269e36c1a4bb0d85946a8db52c0fccaa499d.png"
}
