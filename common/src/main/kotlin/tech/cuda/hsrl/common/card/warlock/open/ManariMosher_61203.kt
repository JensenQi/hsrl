package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManariMosher_61203 : Card() {
    override val id = 61203
    override val name = "摇滚堕落者"
    override val description = "<b>战吼：</b>在本回合中，使一个友方恶魔获得+3攻击力和<b>吸血</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“精英牛头人酋长太——主流了。你听说过凋零野猪吗？”"
    override val artist = "L. Lullabi & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16ad025456251b8711d9900c800f5bb8d73d6c17d5d9221e9c1a00b15df6b8bf.png"
}
